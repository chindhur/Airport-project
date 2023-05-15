package com.interfaces;

import java.util.List;

public interface IGenericLambda<T> {

    <T> List<T> function(List<T> list);
}
