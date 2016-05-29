package cz.iba.level5;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author Miroslava Voglova
 */
@Controller
public class StudentController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String redirect() {
        return "redirect:/fill";
    }

    @RequestMapping(value = "/fill", method = RequestMethod.GET)
    public String fillForm(ModelMap model) {
        model.addAttribute("command", new Student());
        model.addAttribute("genderValues", Gender.values());
        return "form";
    }

    @RequestMapping(value = "/view", method = RequestMethod.POST)
    public String viewData(@ModelAttribute("command") Student student, ModelMap model) {
        model.addAttribute("name", student.getName());
        model.addAttribute("nickname", student.getNickname());        
        
        model.addAttribute("birthDate", student.getBirthDate());
        model.addAttribute("gender", student.getGender());

        return "dataView";
    }

    @InitBinder
    public void bindingPreparation(WebDataBinder binder) {
        DateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");
        CustomDateEditor orderDateEditor = new CustomDateEditor(dateFormat, true);
        binder.registerCustomEditor(Date.class, orderDateEditor);
        binder.registerCustomEditor(Gender.class, new GenderEditor());
    }

}
