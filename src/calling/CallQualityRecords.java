package calling;
import java.io.*;

public class CallQualityRecords {

    public void saveCallQuality(CallQuality callQuality) {
        try {
            FileOutputStream fileout = new FileOutputStream(callQuality.getCallId() + ".dat");
            ObjectOutputStream objectout = new ObjectOutputStream(fileout);
            objectout.writeObject(callQuality);
            objectout.flush();
            objectout.close();
        } catch (FileNotFoundException e) {
            System.out.println(e);
        } catch (IOException e1) {
            System.out.println(e1);
        }
    }

    public void displayCallQuality(int callId) {
        try {
            FileInputStream filein = new FileInputStream(callId + ".dat");
            ObjectInputStream objectin = new ObjectInputStream(filein);
            CallQuality callQuality = (CallQuality) objectin.readObject();

            System.out.println("Call ID: " + callQuality.getCallId());
            System.out.println("Call Duration: " + callQuality.getCallDuration());
            System.out.println("Call Quality Grade: " + callQuality.getCallQualityGrade());
            System.out.println("Customer Name: " + callQuality.getCustomerName());
        } catch (FileNotFoundException e1) {
            System.out.println(e1);
        } catch (IOException e2) {
            System.out.println(e2);
        } catch (ClassNotFoundException e) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        CallQuality callQuality = new CallQuality(1, 13, "Excellent", "John");

        CallQualityRecords records = new CallQualityRecords();

        records.saveCallQuality(callQuality);
        records.displayCallQuality(callQuality.getCallId());
    }
}
