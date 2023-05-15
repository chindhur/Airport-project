package com.utils;

import com.interfaces.IGenericLambda;

import java.util.ArrayList;
import java.util.List;

public class ReverseListLambda implements IGenericLambda {

    @Override
    public List function(List list) {
        List reversedList = new ArrayList<>();
        for(int i=list.size()-1;i>=0;i--){
            reversedList.add(list.get(i));
        }
        return reversedList;
    }
}
