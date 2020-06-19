import java.util.ArrayList;
import java.util.List;

/**
 * 請產出一百組英(大小寫)數字混合不重覆十位數的識別碼，並驗證此一百組為非重覆識別碼
 * 
 */

class HomeWork2 {

 public static void main(String[]args){

 List<String> list = new ArrayList<String>();
 String newCode= null;//新識別碼
 boolean isRepeat = true;//判斷識別碼在list是否重複

 while(list.size()<100){

 //產生10位識別碼
 newCode= generateRandomStr(10);
 //判斷識別碼在list是否重複
 isRepeat =list.contains(newCode);

    //驗證不重複才加入
    if(isRepeat){
        continue;
      }else{
      	list.add(newCode);
      }

  if(list.size()==100){
         break;  //直到完成產生100組結束
       }

}


 for(int i=0;i<list.size();i++){ //列印結果
    System.out.println((i+1)+" : "+list.get(i));
 }


}


//產生識別碼方法,len為碼數
public static String generateRandomStr(int len){   
        //字元源
        String generateSource = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        //回傳產生的識別碼
        String rtnStr = "";

        for(int i = 0;i < len;i++){
            String nowStr = String.valueOf(generateSource.charAt((int)Math.floor(Math.random()* generateSource.length())));
            rtnStr += nowStr;
            generateSource = generateSource.replaceAll(nowStr,"");
        }

        return rtnStr;

    }

}