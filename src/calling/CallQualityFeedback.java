package calling;

import java.util.function.Consumer;

class CallQualityFeedBack {
    int customerId;
    String feedBackDescription;

    public CallQualityFeedBack(int customerId, String feedBackDescription) {
        this.customerId = customerId;
        this.feedBackDescription = feedBackDescription;
    }

    public static void evaluateFeedBack(CallQualityFeedBack feedback, Consumer operation) {
        operation.accept(feedback);
    }

    public static void main(String[] args) {
        CallQualityFeedBack feedback = new CallQualityFeedBack(123, "Good call quality");

       
        Consumer printFeedback = fb -> {
            if (fb instanceof CallQualityFeedBack) {
                CallQualityFeedBack feedbackInstance = (CallQualityFeedBack) fb;
                System.out.println("Customer ID: " + feedbackInstance.customerId);
                System.out.println("Feedback Description: " + feedbackInstance.feedBackDescription);
            }
        };

       
        evaluateFeedBack(feedback, printFeedback);
    }
}
