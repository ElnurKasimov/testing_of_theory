package HyperSkill.Patterns.Builder;

import java.util.List;

/**
 * Builder interface describe step of object creation.
 **/
public interface Builder {
    void setType(String type);

    void setLanguages(List<String> languages);

    void setExperience(int experience);
}
