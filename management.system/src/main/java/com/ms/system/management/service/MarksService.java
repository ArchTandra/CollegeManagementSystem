package com.ms.system.management.service;

import org.springframework.stereotype.Component;

@Component
public class MarksService {


    public String getMarks(String id, String subjectName)
    {
        if(id.equals("maitri") )
        {
            if(subjectName == null)
            return "100";
            if(subjectName.equals("maths"))
            {
                return "50";
            }
            if( subjectName.equals("english"))
            {
                return "50";
            }


        }

        if(id.equals("sreelakshmi"))
            return "95";
        if(id.equals("deema"))
            return "85";

        return  "empty";
    }

}