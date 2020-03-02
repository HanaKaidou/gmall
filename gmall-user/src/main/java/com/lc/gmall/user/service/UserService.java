package com.lc.gmall.user.service;

import com.lc.gmall.user.poJo.UmsMember;
import java.util.List;

/**
 * Created by LC on 2020/3/2 16:53
 */
public interface UserService {

    List<UmsMember> getAllUser();

    UmsMember getUserById(String userId);
}
