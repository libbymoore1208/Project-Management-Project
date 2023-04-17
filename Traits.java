public class Traits 
{
    private int traitId;
    private String traitName;
    private String traitDescription;
    private String traitEffect;
    
    // Constructors
    public Traits(int traitId, String traitName, String traitDescription, String traitEffect) 
    {
        setTraitId(traitId);
        setTraitName(traitName);
        setTraitDescription(traitDescription);
        setTraitEffect(traitEffect);
    }
    
    // Getters and Setters
    public int getTraitId() 
    {
        return traitId;
    }
    
    public void setTraitId(int traitId) 
    {
        if (traitId <= 0) 
        {
            throw new IllegalArgumentException("Trait ID must be a positive integer.");
        }
        this.traitId = traitId;
    }
    
    public String getTraitName() 
    {
        return traitName;
    }
    
    public void setTraitName(String traitName) 
    {
        if (traitName == null || traitName.trim().isEmpty()) 
        {
            throw new IllegalArgumentException("Trait name cannot be null or empty.");
        }
        this.traitName = traitName;
    }
    
    public String getTraitDescription() 
    {
        return traitDescription;
    }
    
    public void setTraitDescription(String traitDescription) 
    {
        if (traitDescription == null || traitDescription.trim().isEmpty()) 
        {
            throw new IllegalArgumentException("Trait description cannot be null or empty.");
        }
        this.traitDescription = traitDescription;
    }
    
    public String getTraitEffect() 
    {
        return traitEffect;
    }
    
    public void setTraitEffect(String traitEffect) 
    {
        if (traitEffect == null || traitEffect.trim().isEmpty()) 
        {
            throw new IllegalArgumentException("Trait effect cannot be null or empty.");
        }  
        this.traitEffect = traitEffect;
    }
}
