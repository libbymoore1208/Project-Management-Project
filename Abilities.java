public class Abilities 
{
    private int abilityId;
    private String abilityName;
    private String abilityDescription;
    private String abilityAffect;
    
    // Constructors
    public Abilities(int abilityId, String abilityName, String abilityDescription, String abilityAffect) 
    {
        setAbilityId(abilityId);
        setAbilityName(abilityName);
        setAbilityDescription(abilityDescription);
        setAbilityAffect(abilityAffect);
    }
    
    // Getters and Setters
    public int getAbilityId() 
    {
        return abilityId;
    }
    
    public void setAbilityId(int abilityId) 
    {
        if (abilityId <= 0)    
        {
            throw new IllegalArgumentException("Ability ID must be a positive integer.");
        }
        this.abilityId = abilityId;
    }
    
    public String getAbilityName() 
    {
        return abilityName;
    }
    
    public void setAbilityName(String abilityName) 
    {
        if (abilityName == null || abilityName.trim().isEmpty()) 
        {
            throw new IllegalArgumentException("Ability name cannot be null or empty.");
        }
        this.abilityName = abilityName;
    }
    
    public String getAbilityDescription() 
    {
        return abilityDescription;
    }
    
    public void setAbilityDescription(String abilityDescription) 
    {
        if (abilityDescription == null || abilityDescription.trim().isEmpty()) 
        {
            throw new IllegalArgumentException("Ability description cannot be null or empty.");
        }
        this.abilityDescription = abilityDescription;
    }
    
    public String getAbilityAffect() 
    {
        return abilityAffect;
    }
    
    public void setAbilityAffect(String abilityAffect) 
    {
        if (abilityAffect == null || abilityAffect.trim().isEmpty()) 
        {
            throw new IllegalArgumentException("Ability affect cannot be null or empty.");
        }
        this.abilityAffect = abilityAffect;
    }
}
