import static cucumber.api.groovy.EN.*

import cucumber.api.PendingException

Given(~/^a mistery number (\d+)$/) { int number ->
    go "/${number}"
    assert $("h1").text() == "Welcome to Codebreaker"
    assert $("form")
    assert $("input#guess")
    assert $("button")
    assert $("ul")
}

When(~/^we start the game$/) { ->
    $("input#guess") << "4567"
    $("button").click()
}

Then(~/^the game must be initialized$/) { ->
    assert $("li")[0].text() == "4732 - _*"
}