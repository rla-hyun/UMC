package umc.service.TempService;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import umc.apiPayload.code.status.ErrorStatus;
import umc.apiPayload.exception.handler.TempHandler;

@Service
@RequiredArgsConstructor
public class TempCommandServiceImpl implements TempQueryService{

    @Override
    public void CheckFlag(Integer flag) {

    }
}
