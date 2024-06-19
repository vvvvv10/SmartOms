package com.smart.oms.activities;

import com.smart.oms.customer.ActivitiesDO;
import com.smart.crm.domain.activites.Activities;
import com.smart.crm.domain.activites.gateway.ActivitiesGateway;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Component
public class ActivitiesGatewayImpl implements ActivitiesGateway {
    @Autowired
    private ActivitiesMapper activitiesMapper;

    @Override
    public Activities add(Activities activities) {
        com.smart.oms.activities.Activities activities1 = new com.smart.oms.activities.Activities();
        BeanUtils.copyProperties(activities, activities1);
        activities1.setIsDelete(0);
        activities1.setCreateTime(new Date());
        activitiesMapper.insertSelective(activities1);
        return null;
    }

    @Override
    public Activities getByById(Long customerId) {
        return null;
    }

    @Override
    public List<Activities> selectByActivities(Activities activities) {
        ActivitiesDO activitiesDO = new ActivitiesDO();
        BeanUtils.copyProperties(activities, activitiesDO);

        ActivitiesExample activitiesExample = new ActivitiesExample();
        ActivitiesExample.Criteria criteria = activitiesExample.createCriteria();
        List<com.smart.oms.activities.Activities> activities2 = activitiesMapper.selectByExample(activitiesExample);

        List<Activities> activities1 = new ArrayList<>();
        activities2.stream().forEach(source -> {
            Activities target = new Activities();
            BeanUtils.copyProperties(source, target);
            activities1.add(target);
        });
        return activities1;
    }
}
