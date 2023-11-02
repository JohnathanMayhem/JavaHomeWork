package edu.hw3;

import edu.hw3.Task5.Contact;
import edu.hw3.Task5.SortType;
import edu.hw3.Task5.Task5;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
public class TestTask5 {

    @Test
    @DisplayName("CounterTable")
    void testCipher() {
        // given
        String[][] names = {{"John Locke", "Thomas Aquinas", "David Hume", "Rene Descartes"}, {"Paul Erdos", "Leonhard Euler", "Carl Gauss"}, {}, null};
        SortType[] types = {SortType.ASC, SortType.DESC, SortType.DESC, SortType.DESC};

        ArrayList<ArrayList<Contact>> res = new ArrayList<>();
        ArrayList<Contact> res1 = new ArrayList<>();
        res1.add(Task5.parseContact("Thomas Aquinas"));
        res1.add(Task5.parseContact("Rene Descartes"));
        res1.add(Task5.parseContact("David Hume"));
        res1.add(Task5.parseContact("John Locke"));
        res.add(res1);
        res1 = new ArrayList<>();
        res1.add(Task5.parseContact("Carl Gauss"));
        res1.add(Task5.parseContact("Leonhard Euler"));
        res1.add(Task5.parseContact("Paul Erdos"));
        res.add(res1);
        res1 = new ArrayList<>();
        res.add(res1);
        res1 = new ArrayList<>();
        res.add(res1);

        ArrayList<List<Contact>> evenRes = new ArrayList<>();
        for (int i = 0; i < names.length; ++i) {
            evenRes.add(Task5.parseContacts(names[i], types[i]));
        }
        //Contact res =
        // then
        boolean areEq = evenRes.equals(res);
        assertThat(areEq).isEqualTo(true);
    }

}
