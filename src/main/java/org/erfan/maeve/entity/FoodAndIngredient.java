package org.erfan.maeve.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.Where;

@Entity
@Table(name = "food_and_ingredient")
@SQLDelete(sql = "UPDATE food_and_ingredients SET is_active = false WHERE food_and_ingredients_id = ?")
@Where(clause = "is_active = true")
public class FoodAndIngredient extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long foodAndIngredientsId;

    private Long foodId;
    private Long ingredientId;

    // Getter & Setter
    public Long getFoodAndIngredientsId() { return foodAndIngredientsId; }
    public void setFoodAndIngredientsId(Long foodAndIngredientsId) { this.foodAndIngredientsId = foodAndIngredientsId; }

    public Long getFoodId() { return foodId; }
    public void setFoodId(Long foodId) { this.foodId = foodId; }

    public Long getIngredientId() { return ingredientId; }
    public void setIngredientId(Long ingredientId) { this.ingredientId = ingredientId; }
}

