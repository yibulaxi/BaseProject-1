package com.yunwei.map.greedao;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;

import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.Property;
import de.greenrobot.dao.internal.DaoConfig;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.

/**
 * DAO for table "TRACK_POINT".
*/
public class TrackPointDao extends AbstractDao<TrackPoint, Void> {

    public static final String TABLENAME = "TRACK_POINT";

    /**
     * Properties of entity TrackPoint.<br/>
     * Can be used for QueryBuilder and for referencing column names.
    */
    public static class Properties {
        public final static Property Time = new Property(0, Long.class, "time", false, "TIME");
        public final static Property Lat = new Property(1, Double.class, "lat", false, "LAT");
        public final static Property Lng = new Property(2, Double.class, "lng", false, "LNG");
        public final static Property X = new Property(3, Double.class, "x", false, "X");
        public final static Property Y = new Property(4, Double.class, "y", false, "Y");
        public final static Property Speed = new Property(5, Float.class, "speed", false, "SPEED");
        public final static Property GpsSpeed = new Property(6, Float.class, "gpsSpeed", false, "GPS_SPEED");
        public final static Property Distance = new Property(7, Double.class, "distance", false, "DISTANCE");
        public final static Property Provider = new Property(8, String.class, "Provider", false, "PROVIDER");
    };


    public TrackPointDao(DaoConfig config) {
        super(config);
    }
    
    public TrackPointDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(SQLiteDatabase db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"TRACK_POINT\" (" + //
                "\"TIME\" INTEGER," + // 0: time
                "\"LAT\" REAL," + // 1: lat
                "\"LNG\" REAL," + // 2: lng
                "\"X\" REAL," + // 3: x
                "\"Y\" REAL," + // 4: y
                "\"SPEED\" REAL," + // 5: speed
                "\"GPS_SPEED\" REAL," + // 6: gpsSpeed
                "\"DISTANCE\" REAL," + // 7: distance
                "\"PROVIDER\" TEXT);"); // 8: Provider
    }

    /** Drops the underlying database table. */
    public static void dropTable(SQLiteDatabase db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"TRACK_POINT\"";
        db.execSQL(sql);
    }

    /** @inheritdoc */
    @Override
    protected void bindValues(SQLiteStatement stmt, TrackPoint entity) {
        stmt.clearBindings();
 
        Long time = entity.getTime();
        if (time != null) {
            stmt.bindLong(1, time);
        }
 
        Double lat = entity.getLat();
        if (lat != null) {
            stmt.bindDouble(2, lat);
        }
 
        Double lng = entity.getLng();
        if (lng != null) {
            stmt.bindDouble(3, lng);
        }
 
        Double x = entity.getX();
        if (x != null) {
            stmt.bindDouble(4, x);
        }
 
        Double y = entity.getY();
        if (y != null) {
            stmt.bindDouble(5, y);
        }
 
        Float speed = entity.getSpeed();
        if (speed != null) {
            stmt.bindDouble(6, speed);
        }
 
        Float gpsSpeed = entity.getGpsSpeed();
        if (gpsSpeed != null) {
            stmt.bindDouble(7, gpsSpeed);
        }
 
        Double distance = entity.getDistance();
        if (distance != null) {
            stmt.bindDouble(8, distance);
        }
 
        String Provider = entity.getProvider();
        if (Provider != null) {
            stmt.bindString(9, Provider);
        }
    }

    /** @inheritdoc */
    @Override
    public Void readKey(Cursor cursor, int offset) {
        return null;
    }    

    /** @inheritdoc */
    @Override
    public TrackPoint readEntity(Cursor cursor, int offset) {
        TrackPoint entity = new TrackPoint( //
            cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // time
            cursor.isNull(offset + 1) ? null : cursor.getDouble(offset + 1), // lat
            cursor.isNull(offset + 2) ? null : cursor.getDouble(offset + 2), // lng
            cursor.isNull(offset + 3) ? null : cursor.getDouble(offset + 3), // x
            cursor.isNull(offset + 4) ? null : cursor.getDouble(offset + 4), // y
            cursor.isNull(offset + 5) ? null : cursor.getFloat(offset + 5), // speed
            cursor.isNull(offset + 6) ? null : cursor.getFloat(offset + 6), // gpsSpeed
            cursor.isNull(offset + 7) ? null : cursor.getDouble(offset + 7), // distance
            cursor.isNull(offset + 8) ? null : cursor.getString(offset + 8) // Provider
        );
        return entity;
    }
     
    /** @inheritdoc */
    @Override
    public void readEntity(Cursor cursor, TrackPoint entity, int offset) {
        entity.setTime(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.setLat(cursor.isNull(offset + 1) ? null : cursor.getDouble(offset + 1));
        entity.setLng(cursor.isNull(offset + 2) ? null : cursor.getDouble(offset + 2));
        entity.setX(cursor.isNull(offset + 3) ? null : cursor.getDouble(offset + 3));
        entity.setY(cursor.isNull(offset + 4) ? null : cursor.getDouble(offset + 4));
        entity.setSpeed(cursor.isNull(offset + 5) ? null : cursor.getFloat(offset + 5));
        entity.setGpsSpeed(cursor.isNull(offset + 6) ? null : cursor.getFloat(offset + 6));
        entity.setDistance(cursor.isNull(offset + 7) ? null : cursor.getDouble(offset + 7));
        entity.setProvider(cursor.isNull(offset + 8) ? null : cursor.getString(offset + 8));
     }
    
    /** @inheritdoc */
    @Override
    protected Void updateKeyAfterInsert(TrackPoint entity, long rowId) {
        // Unsupported or missing PK type
        return null;
    }
    
    /** @inheritdoc */
    @Override
    public Void getKey(TrackPoint entity) {
        return null;
    }

    /** @inheritdoc */
    @Override    
    protected boolean isEntityUpdateable() {
        return true;
    }
    
}