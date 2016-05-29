package cz.iba.level5;

import java.beans.PropertyEditorSupport;

/**
 *
 * @author Miroslava Voglova
 */
public class GenderEditor extends PropertyEditorSupport {

    @Override
    public void setAsText(String text) {
            Gender gender = Gender.valueOf(text);
            setValue(gender);
    }

    @Override
    public String getAsText() {
        Gender gender = (Gender) getValue();
        return (gender == null)? null : gender.toString();
    }
}
