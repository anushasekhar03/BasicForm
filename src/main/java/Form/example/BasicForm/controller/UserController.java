package Form.example.BasicForm.controller;

import Form.example.BasicForm.model.User;
import Form.example.BasicForm.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

@Controller
public class UserController {

    @Autowired
    private UserRepository userRepository;

    // Show the registration form
    @GetMapping("/register")
    public String showRegistrationForm(Model model) {
        model.addAttribute("user", new User()); // Pass an empty User object to the form
        return "registrationForm"; // Thymeleaf will render registrationForm.html
    }

    // Handle form submission
    @PostMapping("/register")
    public String handleRegistration(@ModelAttribute User user) {
        userRepository.save(user); // Save user data to database
        return "redirect:/success"; // Redirect to a success page (can create success.html)
    }
}
