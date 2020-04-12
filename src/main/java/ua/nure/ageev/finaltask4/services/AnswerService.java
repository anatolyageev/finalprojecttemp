package ua.nure.ageev.finaltask4.services;

import ua.nure.ageev.finaltask4.domain.Answer;
import ua.nure.ageev.finaltask4.services.base.BasicService;
import ua.nure.ageev.finaltask4.services.base.ChildService;

public interface AnswerService extends BasicService<Long, Answer, String>, ChildService<Long,Answer,String> {
}
