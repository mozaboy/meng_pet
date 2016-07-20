package com.pet.service.impl;

import com.pet.dao.PersonDao;
import com.pet.pojo.Person;
import com.pet.service.IPersonService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2016/7/9.
 */
@Service("personService")
public class PersonServiceImpl implements IPersonService {

    @Resource
    private PersonDao personDao;

    @Override
    public List<Person> getUserByParam(Map<String,Object> param) {
        return this.personDao.selectByParam(param);
    }


}
