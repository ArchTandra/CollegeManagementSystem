package service;

import org.springframework.stereotype.Component;

@Component
public class MarksService {

    public String getMarks(String id, String subjectName)
    {
        if(id.equals("maitri") )
        {
            if(subjectName.equals("maths"))
            {
                return "50";
            }
            if(subjectName.equals("english"))
            {
                return "50";
            }
            return "100";
        }

        if(id.equals("sreelakshmi"))
            return "95";
        if(id.equals("deema"))
            return "85";

        return  "empty";
    }

}
