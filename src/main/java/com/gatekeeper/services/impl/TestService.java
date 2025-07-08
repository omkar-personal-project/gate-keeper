package com.gatekeeper.services.impl;

import com.gatekeeper.entity.Login;
import com.gatekeeper.repository.LoginRepository;
import com.gatekeeper.services.interfaces.ITestService;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

@Service
@RequiredArgsConstructor
@Getter
@Setter
public class TestService implements ITestService {

    @Autowired
    private LoginRepository loginRepository;

    @Override
    public void test() {
        List<Login> list = loginRepository.findAll();
        System.out.println(Arrays.toString(list.toArray()));
    }
}
