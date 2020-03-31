package xyz.sunwei.designpattern.converter;

import java.util.function.Function;

/**
 * Domain entity or aggregator converter
 *
 * @param <D> Domain Entity or Domain Aggregator representation's type
 * @param <T> Persistent Object representation's type
 */
public class Converter<D, T> {
    private final Function<D, T> convertFun;

    public Converter(final Function<D, T> convertFun) {
        this.convertFun = convertFun;
    }

    public final T fromDomainEntity(final D domainEntity) {
        return convertFun.apply(domainEntity);
    }
}
