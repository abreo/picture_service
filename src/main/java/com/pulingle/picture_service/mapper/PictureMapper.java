package com.pulingle.picture_service.mapper;

import com.pulingle.picture_service.domain.entity.Picture;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

/**
 * Created by @杨健 on 2018/4/1 17:43
 *
 * @Des: 图片Mapper
 */
@Component("pictureMapper")
public interface PictureMapper {

    /**
    * @param: picture
    * @return: int
    * @Des: 插入一条照片记录
    */
    int insert(Picture picture);


}
