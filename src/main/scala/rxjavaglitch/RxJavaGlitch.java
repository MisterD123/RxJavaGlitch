package rxjavaglitch;

import java.io.*;
import io.reactivex.*;
import io.reactivex.subjects.*;

public class RxJavaGlitch {
    public static void main(String[] args) {
        // Dataflow Program
        PublishSubject<Integer> subject = PublishSubject.create();
        Observable<Integer> increment = subject.map(x -> x + 1);
        Observable<Integer> decrement = subject.map(x -> x - 1);
        Observable.combineLatest(increment, decrement, (i, d) -> i + d )
          .subscribe(System.out::println);
        
        // User IO handling
        try {
            BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
            String line;
            System.out.print("Input number or nothing > ");
            while((line = in.readLine()) != null && line.length() > 0) {
                try {
                    subject.onNext(Integer.parseInt(line));
                } catch (Exception e) {
                    System.out.println("Error parsing input: " + e.getMessage());
                }
                System.out.print("Input number or nothing > ");
            }
            System.out.println("Bye!");
        } catch (Exception e) {
            System.out.println("Unknown Error:");
            e.printStackTrace();
        }
    }
}