package com.shahabyounas.readinglist;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * Created by Shahab on 7/23/2017.
 */
@Controller
@RequestMapping("/")
public class ReadingListController {

    @Autowired
    private ReadingListRepository readingListRepository;

    @Autowired
    private AmazonProperties amazonProperties;



   // @RequestMapping(value = {"/reader"} ,method = RequestMethod.GET)
  //  @GetMapping()
    @RequestMapping(method = RequestMethod.GET)
    public String readerBooks( Reader reader, Model model ){

        List<Book> readingList = readingListRepository.findByReader(reader);

        if(readingList != null){
            model.addAttribute("books",readingList);
            model.addAttribute("reader",reader);
            model.addAttribute("amazonID",amazonProperties.getAssociateId());
        }
        return "readingList";
    }


    @RequestMapping(method = RequestMethod.POST)
    public String addToReadingList( Reader reader, Book book ){

        book.setReader(reader);
        readingListRepository.save(book);

        return "redirect:/";

    }


}
