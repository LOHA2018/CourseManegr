package team.loha.coursemanage.mapper;

import org.springframework.stereotype.Repository;
import team.loha.coursemanage.entity.Seminar;

import java.util.List;

@Repository
public interface SeminarMapper {
    public List<Seminar> getAllSeminarByCourseId(long id);
    public Seminar getSeminarById(long id);
}
