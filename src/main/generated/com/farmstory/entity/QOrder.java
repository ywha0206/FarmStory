package com.farmstory.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QOrder is a Querydsl query type for Order
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QOrder extends EntityPathBase<Order> {

    private static final long serialVersionUID = -186960001L;

    public static final QOrder order = new QOrder("order1");

    public final StringPath orderAddr = createString("orderAddr");

    public final StringPath orderDate = createString("orderDate");

    public final NumberPath<Integer> orderItemDiscount = createNumber("orderItemDiscount", Integer.class);

    public final StringPath orderMemo = createString("orderMemo");

    public final NumberPath<Integer> orderNo = createNumber("orderNo", Integer.class);

    public final StringPath orderReceiveHp = createString("orderReceiveHp");

    public final StringPath orderReceiveName = createString("orderReceiveName");

    public final StringPath orderSendHp = createString("orderSendHp");

    public final StringPath orderSendName = createString("orderSendName");

    public final NumberPath<Integer> orderTotalPrice = createNumber("orderTotalPrice", Integer.class);

    public final StringPath orderUserId = createString("orderUserId");

    public QOrder(String variable) {
        super(Order.class, forVariable(variable));
    }

    public QOrder(Path<? extends Order> path) {
        super(path.getType(), path.getMetadata());
    }

    public QOrder(PathMetadata metadata) {
        super(Order.class, metadata);
    }

}

