package HomeTask2;

public class Response {

   String body;
   int code;
   String type;

   Response(String body,int code,String type){
       this.body=body;
       this.code=code;
       this.type=type;
   }

   public String toString(){
       return ("Response ["+" Body:"+this.body+
               " Code:"+this.code+
               " Type:"+this.type+
               "]");
   }
}
