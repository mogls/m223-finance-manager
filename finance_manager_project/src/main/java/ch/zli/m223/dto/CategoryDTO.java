package ch.zli.m223.dto;

public class CategoryDTO {
    public String categoryName;
    public String categoryType; // Changed to String to match the EnumType.STRING in the model

    public CategoryDTO(String categoryName, String categoryType) {
        this.categoryName = categoryName;
        this.categoryType = categoryType;
    }

}
