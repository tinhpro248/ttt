package com.esme.spring.faircorp.web;

import com.esme.spring.faircorp.model.Building;
import com.esme.spring.faircorp.repository.BuildingDao;
import com.esme.spring.faircorp.web.Request.UserRequest;
import com.esme.spring.faircorp.web.dto.BuildingDto;
import com.esme.spring.faircorp.web.dto.LoginDTO;
import com.esme.spring.faircorp.web.dto.ProfileDTO;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author devmind
 */
@CrossOrigin
@RestController
@RequestMapping("/api")
@Transactional
public class BuildingController {

    private BuildingDao buildingDao;

    @PostMapping("user/login")
    public LoginDTO login(@RequestHeader String userName, @RequestHeader String password){
        return new LoginDTO(1, "Dương Bá Tình", true, null);
    }
    @PutMapping("user/register")
    public LoginDTO register(@RequestBody UserRequest user){
        return new LoginDTO(1, "Dương Bá Tình", true, null);
    }

    @GetMapping("user/profile")
    public ProfileDTO profile(@Param("id") int id){
        return new ProfileDTO(1, "Dương Bá Tình", true, "duongbatinh@gmail.com", "1234567891", new Date("10/04/2001"), "123456789110", "P001", null);
    }
//
//    @GetMapping("")
//    public boolean ff(){
//        return true;
//    }
//
//    @PostMapping("user/edit")
//    public ProfileDTO editProfile(@RequestBody ProfileReponse user){
//        return new ProfileReponse();
//    }

    @PostMapping("user/edit-password")
    public boolean editPassword(@Param("id") int id, @RequestBody String password, @RequestBody String newPassword){
        return true;
    }




    public BuildingController(BuildingDao buildingDao) {
        this.buildingDao = buildingDao;
    }

    @GetMapping
    public List<BuildingDto> findAll() {
        return buildingDao.findAll()
                          .stream()
                          .sorted(Comparator.comparing(Building::getName))
                          .map(BuildingDto::new)
                          .collect(Collectors.toList());
    }

    @GetMapping(path = "/{id}")
    public String findById(@PathVariable Long id) {
        return "HAHA";
    }

    @PostMapping
    public BuildingDto create(@RequestBody BuildingDto dto) {
        Building building = null;
        if (dto.getId() != null) {
            building = buildingDao.findById(dto.getId()).orElse(null);
        }

        if (building == null) {
            building = buildingDao.save(new Building(dto.getName()));
        } else {
            building.setName(dto.getName());
            buildingDao.save(building);
        }

        return new BuildingDto(building);
    }

    @DeleteMapping(path = "/{id}")
    public void delete(@PathVariable Long id) {
        buildingDao.deleteById(id);
    }
}
