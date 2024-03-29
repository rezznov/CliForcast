package com.example.cliforcast.database;

import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;

import java.util.List;

@androidx.room.Dao
public interface Dao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insertCity(Weather weather);

    @Query("select * from cities where id = :id and day = :day")
    Weather getCityById(int id, int day);

    @Query("select * from cities where lat = :lat and lon = :lon")
    Weather getCityByCoord(double lat,double lon);

    @Query("select * from cities")
    List<Weather> getAllCities();


}
