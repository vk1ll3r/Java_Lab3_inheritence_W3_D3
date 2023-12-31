import java.util.ArrayList;

public class User {
    private String username;
    private String email;
    private ArrayList<Media> purchasedMediaList = new ArrayList<Media>() ;
    private ArrayList<Media>  shoppingCart = new ArrayList<Media>() ;

    public User() {
    }

    public User(String username, String email, ArrayList<Media> purchasedMediaList, ArrayList<Media> shoppingCart) {
        this.username = username;
        this.email = email;
        this.purchasedMediaList = purchasedMediaList;
        this.shoppingCart = shoppingCart;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public ArrayList<Media> getPurchasedMediaList() {
        return purchasedMediaList;
    }

    public void setPurchasedMediaList(ArrayList<Media> purchasedMediaList) {
        this.purchasedMediaList = purchasedMediaList;
    }

    public ArrayList<Media> getShoppingCart() {
        if (shoppingCart.isEmpty()) {
            System.out.println("Cart is empty");
        }
        return shoppingCart;
    }


    public void setShoppingcart(ArrayList<Media> shoppingCart) {
        this.shoppingCart = shoppingCart;
    }

    public void addTocart(Media media ){
        shoppingCart.add(media);
    }
    public void removeFromCart(Media media){
        shoppingCart.remove(media);
    }
    public void checkout(){
        setPurchasedMediaList(shoppingCart);
        try {
        for (Media m: shoppingCart) {
            removeFromCart(m);
        }
            }catch (Exception e){
                System.out.println(e.getMessage());
            }

        }



    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
