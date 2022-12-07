package guru.springframwork.spring5jokesappv2.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

@Service
public class JockServiceImpl implements JockService {

    private final ChuckNorrisQuotes chuckNorrisQuotes;

    public JockServiceImpl() {
        this.chuckNorrisQuotes= new ChuckNorrisQuotes();
    }

    @Override
    public String getJoke() {
        return chuckNorrisQuotes.getRandomQuote();
    }
}
