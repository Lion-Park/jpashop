package jpabook.jpashop.service;

import jpabook.jpashop.domain.item.Item;
import jpabook.jpashop.repository.ItemRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
@Transactional
public class ItemServiceTest {

    @Autowired
    ItemRepository itemRepository;

    @Autowired
    ItemService itemService;

    @Test
    public void saveItem() throws Exception {
        //given
        Item item = new Item();
        item.setName("product");

        //when
        Long itemId = itemService.saveItem(item);

        //then
        assertEquals(item.getId(), itemId);
    }

    @Test
    public void findItems() throws Exception {
        //given
        Item item = new Item();
        item.setName("test");

        //when
        itemService.saveItem(item);
        List<Item> items = itemService.findItems();

        //then


    }

    @Test
    public void findOne() throws Exception {
        //given

        //when

        //then
    }
}