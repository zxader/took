package org.example.taxi_api.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QTaxi is a Querydsl query type for Taxi
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QTaxi extends EntityPathBase<Taxi> {

    private static final long serialVersionUID = -47166398L;

    public static final QTaxi taxi = new QTaxi("taxi");

    public final NumberPath<Integer> cost = createNumber("cost", Integer.class);

    public final NumberPath<Integer> count = createNumber("count", Integer.class);

    public final DateTimePath<java.time.LocalDateTime> createdAt = createDateTime("createdAt", java.time.LocalDateTime.class);

    public final DateTimePath<java.time.LocalDateTime> finishTime = createDateTime("finishTime", java.time.LocalDateTime.class);

    public final BooleanPath gender = createBoolean("gender");

    public final NumberPath<Long> master = createNumber("master", Long.class);

    public final NumberPath<Integer> max = createNumber("max", Integer.class);

    public final NumberPath<Long> partySeq = createNumber("partySeq", Long.class);

    public final NumberPath<Long> roomSeq = createNumber("roomSeq", Long.class);

    public final NumberPath<Double> startLat = createNumber("startLat", Double.class);

    public final NumberPath<Double> startLon = createNumber("startLon", Double.class);

    public final EnumPath<Taxi.Status> status = createEnum("status", Taxi.Status.class);

    public final ListPath<TaxiGuest, QTaxiGuest> taxiGuests = this.<TaxiGuest, QTaxiGuest>createList("taxiGuests", TaxiGuest.class, QTaxiGuest.class, PathInits.DIRECT2);

    public final NumberPath<Long> taxiSeq = createNumber("taxiSeq", Long.class);

    public final NumberPath<Long> userSeq = createNumber("userSeq", Long.class);

    public QTaxi(String variable) {
        super(Taxi.class, forVariable(variable));
    }

    public QTaxi(Path<? extends Taxi> path) {
        super(path.getType(), path.getMetadata());
    }

    public QTaxi(PathMetadata metadata) {
        super(Taxi.class, metadata);
    }

}

