package br.com.gilmargomes.todolist.utils;


import org.springframework.beans.BeanUtils;
import org.springframework.beans.BeanWrapper;
import org.springframework.beans.BeanWrapperImpl;

import br.com.gilmargomes.todolist.task.TaskModel;

import java.beans.PropertyDescriptor;
import java.util.HashSet;
import java.util.Set;

public class Utils {

    public static void copyNonNullProperties(TaskModel taskModel, Object target) {
        BeanUtils.copyProperties(taskModel, target, getNullPropertyNames(taskModel));
    }

    public static String[] getNullPropertyNames(Object source) {
        final BeanWrapper src = new BeanWrapperImpl(source);
        
        PropertyDescriptor[] pds = src.getPropertyDescriptors();

        Set<String> emptyNames = new HashSet<>();
        for(PropertyDescriptor pd : pds) {
            Object srcValue = src.getPropertyValue(pd.getName());
            if(srcValue == null) emptyNames.add(pd.getName());
        }
        String[] result = new String[emptyNames.size()];
        return emptyNames.toArray(result);        
    }
    
}
