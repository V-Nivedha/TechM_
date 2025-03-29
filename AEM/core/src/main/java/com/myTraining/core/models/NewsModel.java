package com.myTraining.core.models;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

import javax.inject.Inject;
import java.text.SimpleDateFormat;
import java.util.Calendar;

@Model(adaptables = Resource.class, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class NewsModel {

    @Inject
    private String text;

    @Inject
    private String newsDetail;

    @Inject
    private Calendar publishedDate; // FIXED: Changed to Calendar type

    public String getText() {
        return text;
    }

    public String getNewsDetail() {
        return newsDetail;
    }

    public String getFormattedPublishedDate() {
        if (publishedDate != null) {
            SimpleDateFormat sdf = new SimpleDateFormat("dd MMM yyyy");
            return sdf.format(publishedDate.getTime()); // FIXED: Now works with Calendar
        }
        return "N/A";
    }
}
