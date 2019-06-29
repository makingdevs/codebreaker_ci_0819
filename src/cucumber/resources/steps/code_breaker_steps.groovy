import static cucumber.api.groovy.EN.*

import cucumber.api.PendingException

Given(~/^a mistery number (\d+)$/) { int arg1 ->
    go "/"
    assert $("h1").text() == "Welcome to Codebreaker"
    assert $("form")
    assert $("input#guess")
    assert $("button")
    assert $("ul")
}

When(~/^we start the game$/) { ->
    $("input#guess") << "8732"
    $("button").click()
}

Then(~/^the game must be initialized$/) { ->
    assert $("ul li")[0].text() == "8732 - *"
}