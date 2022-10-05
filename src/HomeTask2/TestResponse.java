package HomeTask2;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class TestResponse {

    public static List<Response> execute(List<Response> list, Predicate<Response> res){
        List<Response> result = new ArrayList<>();
        for(Response x : list)
            if(res.test(x))
                result.add(x);
        return result;
    }

    public static void main(String[] args){
        ArrayList<Response> response = new ArrayList<>();
        response.add(new Response("XYZ",200,"HTML"));
        response.add(new Response("snbdhs",400,"XML"));
        response.add(new Response("XYSZ",400,"JSON"));
        response.add(new Response("CHCDBHXYZ",200,"JSON"));
        response.add(new Response("XYZGCG",400,"JSON"));
        response.add(new Response("XYZDHD",200,"XML"));

        //1. Status code equal to 400

        Predicate<Response> r1 = x->{return x.code==400;};

        System.out.println(execute(response,r1));

        //2. status type is JSON

        Predicate<Response> r2= x->{return x.type.equals("JSON");};
        System.out.println(execute(response,r2));

        //3. status 400 and response type JSON

        System.out.println(execute(response,r1.and(r2)));

        //4. status 400 or type JSON

        System.out.println(execute(response,r1.or(r2)));

        // status not 400 and Type json

        System.out.println(execute(response,r1.negate().and(r2)));

    }
}
