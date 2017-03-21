package cn.intelvision.response.face;

import cn.intelvision.model.Person;
import cn.intelvision.response.ZenoResponse;

import java.util.List;

/**
 * Created by pc on 2016/3/16.
 */
public class GroupPersonsResponse extends ZenoResponse {

    private List<Person> persons;

    public List<Person> getPersons() {
        return persons;
    }

}
