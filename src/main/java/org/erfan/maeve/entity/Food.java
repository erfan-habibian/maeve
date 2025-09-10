package org.erfan.maeve.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.Where;
import java.util.List;

@Entity
@Table(name = "food")
@SQLDelete(sql = "UPDATE food SET is_active = false WHERE food_id = ?")
@Where(clause = "is_active = true")
public class Food extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long foodId;

    private String foodName;
    private String foodDescription;
    private Float price;
    private String imagePath;
    private Boolean availability;

    private Long categoryId;

    @ElementCollection
    private List<Long> ingredientList; // ingredient ids

    // Getter & Setter
    public Long getFoodId() { return foodId; }
    public void setFoodId(Long foodId) { this.foodId = foodId; }

    public String getFoodName() { return foodName; }
    public void setFoodName(String foodName) { this.foodName = foodName; }

    public String getFoodDescription() { return foodDescription; }
    public void setFoodDescription(String foodDescription) { this.foodDescription = foodDescription; }

    public Float getPrice() { return price; }
    public void setPrice(Float price) { this.price = price; }

    public String getImagePath() { return imagePath; }
    public void setImagePath(String imagePath) { this.imagePath = imagePath; }

    public Boolean getAvailability() { return availability; }
    public void setAvailability(Boolean availability) { this.availability = availability; }

    public Long getCategoryId() { return categoryId; }
    public void setCategoryId(Long categoryId) { this.categoryId = categoryId; }

    public List<Long> getIngredientList() { return ingredientList; }
    public void setIngredientList(List<Long> ingredientList) { this.ingredientList = ingredientList; }
}

