package fr.imie.recipemanager.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class User {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	private String username;
	private String pwd;
	@OneToMany(mappedBy="owner")
	List<Recipe> recipes;
	/*@OneToMany(mappedBy="owner")
	List<Ingredient> ingredients;
*/
	public User() {}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Boolean verifyPwd(String testPwd) {
		return pwd.equals(testPwd);
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public List<Recipe> getRecipes() {
		return recipes;
	}

	public void setRecipes(List<Recipe> recipes) {
		this.recipes = recipes;
	}
/*
	public List<Ingredient> getIngredients() {
		return ingredients;
	}

	public void setIngredients(List<Ingredient> ingredients) {
		this.ingredients = ingredients;
	}
	*/
}
