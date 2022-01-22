package com.example.mybatisplusdemo.batchMapper;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.mybatisplusdemo.entity.User;
import com.example.mybatisplusdemo.mapper.UserMapper;
import org.springframework.stereotype.Service;

@Service
public class UserIServiceImpl extends ServiceImpl<UserMapper, User> implements UserIService {

}
