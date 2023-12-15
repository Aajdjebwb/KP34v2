package com.kononenko.kp32.data.mappers;

public interface Mapper<I,O> {
    O map(I value);
}
