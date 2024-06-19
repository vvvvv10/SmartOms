package com.smart.oms.clue;

import com.smart.oms.customer.ActivitiesDO;
import com.smart.crm.domain.clue.gateway.ClueGateway;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Component
public class ClueGatewayImpl implements ClueGateway {
    @Autowired
    private ClueMapper clueMapper;

    @Override
    public com.smart.crm.domain.clue.Clue getByById(Long customerId) {
        return null;
    }

    @Override
    public com.smart.crm.domain.clue.Clue add(com.smart.crm.domain.clue.Clue clue) {
        Clue activities1 = new Clue();
        BeanUtils.copyProperties(clue, activities1);
        activities1.setCreateTime(new Date());
        clueMapper.insertSelective(activities1);
        return null;
    }

    @Override
    public List<com.smart.crm.domain.clue.Clue> selectByActivities(com.smart.crm.domain.clue.Clue clue) {
        ActivitiesDO activitiesDO = new ActivitiesDO();
        BeanUtils.copyProperties(clue, activitiesDO);

        ClueExample activitiesExample = new ClueExample();
        List<Clue> activities2 = clueMapper.selectByExample(activitiesExample);

        List<com.smart.crm.domain.clue.Clue> activities1 = new ArrayList<>();
        activities2.stream().forEach(source -> {
            com.smart.crm.domain.clue.Clue target = new com.smart.crm.domain.clue.Clue();
            BeanUtils.copyProperties(source, target);
            activities1.add(target);
        });
        return activities1;
    }
}
