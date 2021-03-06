package uz.market.pcmarket.service;

import lombok.SneakyThrows;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import uz.market.pcmarket.entity.Attachment;
import uz.market.pcmarket.entity.AttachmentContent;
import uz.market.pcmarket.payload.ApiResponse;
import uz.market.pcmarket.repository.AttachmentContentRepository;
import uz.market.pcmarket.repository.AttachmentRepository;


import javax.servlet.http.HttpServletResponse;
import java.util.Iterator;
import java.util.Optional;

@Service
public class AttachmentService {

    final
    AttachmentRepository attachmentRepository;
    final
    AttachmentContentRepository attachmentContentRepository;

    public AttachmentService(AttachmentRepository attachmentRepository, AttachmentContentRepository attachmentContentRepository) {
        this.attachmentRepository = attachmentRepository;
        this.attachmentContentRepository = attachmentContentRepository;
    }


    @SneakyThrows
    public ApiResponse upload(MultipartHttpServletRequest request){

        Iterator<String> fileNames = request.getFileNames();
        MultipartFile file = request.getFile(fileNames.next());
        Attachment attachment = new Attachment();
        attachment.setName(file.getOriginalFilename());
        attachment.setSize(file.getSize());
        attachment.setContentType(file.getContentType());
        Attachment save = attachmentRepository.save(attachment);

        AttachmentContent attachmentContent = new AttachmentContent();
        attachmentContent.setBytes(file.getBytes());
        attachmentContent.setAttachment(save);

        attachmentContentRepository.save(attachmentContent);
        return new ApiResponse("Saved successfully",true,save.getId());
    }

    @SneakyThrows
    public ApiResponse getFile(@PathVariable Integer id, HttpServletResponse response) {
        Optional<Attachment> byId = attachmentRepository.findById(id);
        if (byId.isPresent()) {
            Attachment attachment = byId.get();
            Optional<AttachmentContent> byAttachmentId = attachmentContentRepository.findByAttachmentId(id);
            if (byAttachmentId.isPresent()) {
                AttachmentContent attachmentContent = byAttachmentId.get();
                response.setHeader("Content-Disposition", "" +
                        "attachment;filename=\"" + attachment.getName() + "\"");
                response.setContentType(attachment.getContentType());
                FileCopyUtils.copy(attachmentContent.getBytes(), response.getOutputStream());
            }else {
                return new ApiResponse("not found",false);
            }
        }
        return new ApiResponse("download successfully",true);
    }
}
