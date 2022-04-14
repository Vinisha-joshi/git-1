package com.example.Spring;

import com.example.Spring.Repository.AlienRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.Optional;

@RestController
public class HomeController {
    @Autowired
    AlienRepository alienRepository;


    @RequestMapping("/home")
    public ModelAndView home1() {
        ModelAndView mv = new ModelAndView("pages/home1.jsp");
        return mv;
    }

    //    @RequestMapping("/addAlien")
//    public String home(Alien alien) {
//        alienRepository.save(alien);
//        return "pages/home1.jsp";
//
//    }
    ///// Post for modal
//    @PostMapping(value = "/addAlien")
//    public Alien addAlien(@ModelAttribute("alien") Alien alien) {
//        System.out.println(alien);
//        Alien saveAllein = alienRepository.save(alien);
//        System.out.println(saveAllein);
//        return saveAllein;
//    }

    @PostMapping(value = "/addAlien")
    public Alien addAlien(@RequestBody Alien alien) {
        alienRepository.save(alien);
        return alien;
    }

    @GetMapping ("getAlien")
    public ModelAndView getAlien(@RequestParam int aid) {
        ModelAndView mv = new ModelAndView("pages/showAlien.jsp");
        Alien alien = alienRepository.findByAid(aid);
        System.out.println(alien);
        System.out.println(alienRepository.findByLang("java"));
        System.out.println(alienRepository.findByAidGreaterThan(2));
        mv.addObject(alien);
        return mv;
    }
//    @DeleteMapping(value = "/deleteAlien/{aid}")
//    public String deleteAlien(@PathVariable("aid") int aid){
//        Alien a=alienRepository.getOne(aid);
//        alienRepository.delete(a);
//        return "deleted";
//    }
    @DeleteMapping(value = "/deleteAlien/{aid}")
    public String deleteAlien(@PathVariable("aid") int aid) {
        Optional<Alien> optionalAlien = alienRepository.findById(aid);
        if (optionalAlien.isPresent()) {
            Alien alien = optionalAlien.get();
            alienRepository.deleteById(alien.getAid());
            return "deleted";

        }

        return "data not found";
    }

    @PutMapping(path = "/alien",consumes = MediaType.APPLICATION_JSON_VALUE)
    public Alien UpdateOrSaveAlien( @RequestBody Alien alien) {
        alienRepository.save(alien);
        return alien;
    }


    //    @RequestMapping("aliens")
//    @ResponseBody
//    public String aliens()
//    {
//        return alienRepository.findAll().toString();
//    }
//    @RequestMapping("/alien/{aid}")
//    @ResponseBody
//    public String alien(@PathVariable("aid") int aid)
//    {
//        return alienRepository.findById(aid).toString();
//    }
//    @RequestMapping("aliens")
//    @ResponseBody
//    public List<Alien> aliens()//give jason format,jakson jar file is responsible to convert obj into JASON
//    {
//        return alienRepository.findAll();
//    }
//    @RequestMapping("/alien/{aid}")
//    @ResponseBody
//    public Optional<Alien> alien(@PathVariable("aid") int aid)//give jason format
//    {
//        return alienRepository.findById(aid);
//    }
    @GetMapping("/aliens")
    public List<Alien> aliens()//give jason format,jakson jar file is responsible to convert obj into JASON
    {
        return alienRepository.findAll();
    }

    @RequestMapping("/alien/{aid}")
    public Optional<Alien> alien(@PathVariable("aid") int aid)//give jason format
    {
        return alienRepository.findById(aid);
    }
//    @RequestMapping(path="aliens",produces = {"application/xml"})//it will restrict
//    @ResponseBody
//    public List<Alien> aliens()//give jason format,jakson jar file is responsible to convert obj into JASON
//    {
//        return alienRepository.findAll();
//    }
//    @RequestMapping("home")
//    public String home()
//    {
//         return "home";
//    }
//    @RequestMapping("home1")
//    public String home1(HttpServletRequest req)
//    {
//        HttpSession session= req.getSession();
//        String name= req.getParameter("name");
//        session.setAttribute("name",name);
//        return "home";
//    }
//     @RequestMapping("home1")
//     public String home1(String name,HttpSession session)
//     {
//       session.setAttribute("name",name);
//       return "home";
//     }
//     @RequestMapping("home2")
//     public ModelAndView home2(@RequestParam("name") String myName)
//     {
//         ModelAndView mv= new ModelAndView();
//         mv.addObject("name",myName);
//         mv.setViewName("home");
//         return mv;
//
//     }
//    @RequestMapping("home3")
//    public ModelAndView home3(Alien alien)
//    {
//        ModelAndView mv= new ModelAndView();
//        mv.addObject("obj",alien);
//        mv.setViewName("home");
//        return mv;
//
//    }
//    @RequestMapping("home4")
//    public ModelAndView home4(Alien alien)
//    {
//        ModelAndView mv= new ModelAndView();
//        mv.addObject("obj",alien);
//        mv.setViewName("pages/home1.jsp");
//        return mv;
//
//    }


}
