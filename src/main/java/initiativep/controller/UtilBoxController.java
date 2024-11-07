package initiativep.controller;


import initiativep.dto.UtilBoxDto;
import initiativep.model.UtilBox;
import initiativep.services.UtilBoxService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/utilbox")
public class UtilBoxController {
    @Autowired
    private UtilBoxService utilBoxService;


    @PutMapping("/{id}")
    public ResponseEntity<UtilBox>updateUtilBox(@PathVariable Long id, @RequestBody UtilBoxDto utilBoxDto){
        UtilBox updateUtilBox = utilBoxService.updateUtilBox(id, utilBoxDto);
        return new ResponseEntity<>(updateUtilBox, HttpStatus.CREATED);
    }

}
