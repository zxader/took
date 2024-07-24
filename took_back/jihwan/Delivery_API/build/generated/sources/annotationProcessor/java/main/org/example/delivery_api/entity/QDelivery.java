package org.example.delivery_api.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QDelivery is a Querydsl query type for Delivery
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QDelivery extends EntityPathBase<Delivery> {

    private static final long serialVersionUID = -582252562L;

    public static final QDelivery delivery = new QDelivery("delivery");

    public final StringPath content = createString("content");

    public final NumberPath<Integer> count = createNumber("count", Integer.class);

    public final DateTimePath<java.time.LocalDateTime> createdAt = createDateTime("createdAt", java.time.LocalDateTime.class);

    public final NumberPath<Long> deliverySeq = createNumber("deliverySeq", Long.class);

    public final DateTimePath<java.time.LocalDateTime> deliveryTime = createDateTime("deliveryTime", java.time.LocalDateTime.class);

    public final StringPath deliveryTip = createString("deliveryTip");

    public final DateTimePath<java.time.LocalDateTime> finishTime = createDateTime("finishTime", java.time.LocalDateTime.class);

    public final StringPath notice = createString("notice");

    public final NumberPath<Long> partySeq = createNumber("partySeq", Long.class);

    public final StringPath pickupPlace = createString("pickupPlace");

    public final NumberPath<Long> roomSeq = createNumber("roomSeq", Long.class);

    public final EnumPath<Delivery.Status> status = createEnum("status", Delivery.Status.class);

    public final StringPath storeName = createString("storeName");

    public final NumberPath<Long> userSeq = createNumber("userSeq", Long.class);

    public QDelivery(String variable) {
        super(Delivery.class, forVariable(variable));
    }

    public QDelivery(Path<? extends Delivery> path) {
        super(path.getType(), path.getMetadata());
    }

    public QDelivery(PathMetadata metadata) {
        super(Delivery.class, metadata);
    }

}

