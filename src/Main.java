import Review.Review;
import chat.ChatRoom;
import chat.Message;
import goods.Filter;
import goods.Goods;
import order.Order;
import user.User;

public class Main {
    public static void main(String[] args) {
        User.join();

        for (int i = 0; i < 10; i++) {
            Goods.search();
            Goods.search(new Filter());
            User.addInterestedGoods(new Goods());
        }

        Order.payment();
        Order.cancelPayment();

        User.localCertificate();
        Goods.localSearch(new Filter());

        ChatRoom.sendMessage(new Message());
        Review.save();
    }
}
