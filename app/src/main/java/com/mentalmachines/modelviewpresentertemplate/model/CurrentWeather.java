package com.mentalmachines.modelviewpresentertemplate.model;

import java.util.ArrayList;
import java.util.List;

import rx.Scheduler;

/**
 * Created by CaptofOuterSpace on 8/22/2016.
 */
public class CurrentWeather {
    public Coord coord;
    public List<Weather> weather = new ArrayList<Weather>();
    public String base;
    public Main main;
    public Wind wind;
    public Clouds clouds;
    public Integer dt;
    public Sys sys;
    public Integer id;
    public String name;
    public Integer cod;


    public class Clouds {
        public Integer all;
    }

    public class Coord {
        public Double lon;
        public Double lat;
    }

    public class Main {
        public Double temp;
        public Integer pressure;
        public Integer humidity;
        public Double tempMin;
        public Double tempMax;
    }

    public class Sys {
        public Integer type;
        public Integer id;
        public Double message;
        public String country;
        public Integer sunrise;
        public Integer sunset;
    }

    public class Weather {
        public Integer id;
        public String main;
        public String description;
        public String icon;
    }

    public class Wind {
        public Double speed;
        public Integer deg;
    }
}
